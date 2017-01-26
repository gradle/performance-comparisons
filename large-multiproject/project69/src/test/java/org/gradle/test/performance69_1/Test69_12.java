package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_12 {
    private final Production69_12 production = new Production69_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}