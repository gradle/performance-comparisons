package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_130 {
    private final Production45_130 production = new Production45_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}