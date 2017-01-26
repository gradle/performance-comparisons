package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_118 {
    private final Production45_118 production = new Production45_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}