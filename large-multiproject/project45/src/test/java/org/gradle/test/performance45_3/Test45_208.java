package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_208 {
    private final Production45_208 production = new Production45_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}