package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_16 {
    private final Production69_16 production = new Production69_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}