package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_449 {
    private final Production73_449 production = new Production73_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}