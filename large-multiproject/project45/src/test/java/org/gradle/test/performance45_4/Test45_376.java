package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_376 {
    private final Production45_376 production = new Production45_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}