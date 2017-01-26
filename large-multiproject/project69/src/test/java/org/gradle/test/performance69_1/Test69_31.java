package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_31 {
    private final Production69_31 production = new Production69_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}