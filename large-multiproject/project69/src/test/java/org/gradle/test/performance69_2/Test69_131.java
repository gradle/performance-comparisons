package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_131 {
    private final Production69_131 production = new Production69_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}