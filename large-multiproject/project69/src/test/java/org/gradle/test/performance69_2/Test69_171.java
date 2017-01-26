package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_171 {
    private final Production69_171 production = new Production69_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}