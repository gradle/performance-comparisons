package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_146 {
    private final Production69_146 production = new Production69_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}