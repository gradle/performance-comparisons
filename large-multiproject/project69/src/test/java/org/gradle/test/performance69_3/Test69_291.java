package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_291 {
    private final Production69_291 production = new Production69_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}