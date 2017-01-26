package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_426 {
    private final Production91_426 production = new Production91_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}