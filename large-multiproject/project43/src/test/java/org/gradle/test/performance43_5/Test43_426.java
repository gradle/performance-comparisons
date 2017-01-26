package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_426 {
    private final Production43_426 production = new Production43_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}