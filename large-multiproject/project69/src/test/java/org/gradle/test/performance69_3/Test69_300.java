package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_300 {
    private final Production69_300 production = new Production69_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}