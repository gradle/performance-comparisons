package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_426 {
    private final Production45_426 production = new Production45_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}