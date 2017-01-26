package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_426 {
    private final Production38_426 production = new Production38_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}