package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_132 {
    private final Production45_132 production = new Production45_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}