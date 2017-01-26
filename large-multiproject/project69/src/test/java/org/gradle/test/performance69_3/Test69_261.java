package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_261 {
    private final Production69_261 production = new Production69_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}