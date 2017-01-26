package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_431 {
    private final Production69_431 production = new Production69_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}