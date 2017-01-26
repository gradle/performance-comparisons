package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_37 {
    private final Production69_37 production = new Production69_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}