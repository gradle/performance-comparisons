package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_235 {
    private final Production69_235 production = new Production69_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}