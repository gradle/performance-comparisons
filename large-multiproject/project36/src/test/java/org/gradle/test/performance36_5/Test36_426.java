package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_426 {
    private final Production36_426 production = new Production36_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}