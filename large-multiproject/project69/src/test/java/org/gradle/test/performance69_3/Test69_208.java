package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_208 {
    private final Production69_208 production = new Production69_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}