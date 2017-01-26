package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_164 {
    private final Production69_164 production = new Production69_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}