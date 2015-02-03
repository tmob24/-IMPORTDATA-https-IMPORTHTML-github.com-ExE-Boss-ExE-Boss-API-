package nova.core.gui.nativeimpl;

import nova.core.gui.GuiComponent;

/**
 * A native interface for anything that can hold components.
 * 
 * @author Vic Nightfall
 *
 */
public interface NativeContainer extends NativeGuiComponent {

	public void addElement(GuiComponent<?, ?> element);

	public void removeElement(GuiComponent<?, ?> element);
}
