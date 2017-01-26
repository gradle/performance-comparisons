package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_1 {
    private final Production69_1 production = new Production69_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}