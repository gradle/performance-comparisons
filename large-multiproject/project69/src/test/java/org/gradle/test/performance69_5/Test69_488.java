package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_488 {
    private final Production69_488 production = new Production69_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}