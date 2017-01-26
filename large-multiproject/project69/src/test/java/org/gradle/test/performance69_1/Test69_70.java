package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_70 {
    private final Production69_70 production = new Production69_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}