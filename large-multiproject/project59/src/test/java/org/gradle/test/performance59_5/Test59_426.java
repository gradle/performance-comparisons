package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_426 {
    private final Production59_426 production = new Production59_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}