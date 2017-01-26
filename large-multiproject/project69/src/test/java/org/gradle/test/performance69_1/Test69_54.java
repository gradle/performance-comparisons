package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_54 {
    private final Production69_54 production = new Production69_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}