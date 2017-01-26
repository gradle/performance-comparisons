package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_426 {
    private final Production44_426 production = new Production44_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}