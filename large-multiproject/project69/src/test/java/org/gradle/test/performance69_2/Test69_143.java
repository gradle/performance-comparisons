package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_143 {
    private final Production69_143 production = new Production69_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}