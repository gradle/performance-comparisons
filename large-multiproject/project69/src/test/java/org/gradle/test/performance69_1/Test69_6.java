package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_6 {
    private final Production69_6 production = new Production69_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}