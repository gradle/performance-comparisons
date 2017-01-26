package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_52 {
    private final Production69_52 production = new Production69_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}