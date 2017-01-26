package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_401 {
    private final Production69_401 production = new Production69_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}