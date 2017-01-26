package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_65 {
    private final Production69_65 production = new Production69_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}