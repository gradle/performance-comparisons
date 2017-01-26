package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_295 {
    private final Production69_295 production = new Production69_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}