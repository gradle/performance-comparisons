package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_81 {
    private final Production69_81 production = new Production69_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}