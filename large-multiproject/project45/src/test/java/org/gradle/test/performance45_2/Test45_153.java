package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_153 {
    private final Production45_153 production = new Production45_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}