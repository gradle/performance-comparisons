package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_468 {
    private final Production69_468 production = new Production69_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}