package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_51 {
    private final Production69_51 production = new Production69_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}