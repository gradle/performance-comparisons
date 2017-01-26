package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_63 {
    private final Production69_63 production = new Production69_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}