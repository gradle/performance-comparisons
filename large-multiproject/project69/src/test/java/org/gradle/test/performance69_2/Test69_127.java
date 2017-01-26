package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_127 {
    private final Production69_127 production = new Production69_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}