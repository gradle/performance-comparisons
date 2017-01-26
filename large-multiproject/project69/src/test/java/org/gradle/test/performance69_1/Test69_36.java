package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_36 {
    private final Production69_36 production = new Production69_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}