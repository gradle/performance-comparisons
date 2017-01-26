package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_217 {
    private final Production69_217 production = new Production69_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}