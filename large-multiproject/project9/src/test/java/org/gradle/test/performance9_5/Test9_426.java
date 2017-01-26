package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_426 {
    private final Production9_426 production = new Production9_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}