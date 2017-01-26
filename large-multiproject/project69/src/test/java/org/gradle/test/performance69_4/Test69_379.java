package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_379 {
    private final Production69_379 production = new Production69_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}