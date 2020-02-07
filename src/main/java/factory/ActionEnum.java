package factory;

import java.util.function.Supplier;

public enum ActionEnum {
    LOAD_DATA(ActionLoadData::new),
    LOAD_CONFIG(ActionLoadConfig::new);

    private Supplier<Action> instantiator;

    ActionEnum(Supplier<Action> instantiator) {
        this.instantiator = instantiator;
    }

    public Action getAction() {
        return instantiator.get();
    }
}