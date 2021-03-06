package wizardtranslation.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class SavePerspectiveHandler {
	@Execute
	public void execute(EModelService modelService, MWindow window) {

		// clone the currently active perspective
		MPerspective activePerspective = modelService
				.getActivePerspective(window);
		modelService.cloneElement(activePerspective, window);
	}
}
