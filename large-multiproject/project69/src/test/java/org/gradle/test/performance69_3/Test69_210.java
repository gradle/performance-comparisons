package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_210 {
    private final Production69_210 production = new Production69_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}