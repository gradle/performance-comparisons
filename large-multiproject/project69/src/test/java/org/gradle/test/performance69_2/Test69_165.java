package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_165 {
    private final Production69_165 production = new Production69_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}