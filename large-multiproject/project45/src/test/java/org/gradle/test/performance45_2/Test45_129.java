package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_129 {
    private final Production45_129 production = new Production45_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}