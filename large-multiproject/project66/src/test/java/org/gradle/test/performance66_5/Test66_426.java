package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_426 {
    private final Production66_426 production = new Production66_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}