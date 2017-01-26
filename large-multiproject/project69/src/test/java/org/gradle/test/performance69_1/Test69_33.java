package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_33 {
    private final Production69_33 production = new Production69_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}