package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_426 {
    private final Production2_426 production = new Production2_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}