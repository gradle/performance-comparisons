package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_216 {
    private final Production69_216 production = new Production69_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}