package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_187 {
    private final Production69_187 production = new Production69_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}