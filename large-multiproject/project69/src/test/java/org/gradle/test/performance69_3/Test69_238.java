package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_238 {
    private final Production69_238 production = new Production69_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}