package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_108 {
    private final Production69_108 production = new Production69_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}