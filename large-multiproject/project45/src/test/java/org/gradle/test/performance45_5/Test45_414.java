package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_414 {
    private final Production45_414 production = new Production45_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}