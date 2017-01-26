package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_203 {
    private final Production69_203 production = new Production69_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}