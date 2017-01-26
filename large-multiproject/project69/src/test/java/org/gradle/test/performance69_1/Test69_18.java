package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_18 {
    private final Production69_18 production = new Production69_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}