package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_426 {
    private final Production97_426 production = new Production97_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}