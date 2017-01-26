package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_188 {
    private final Production69_188 production = new Production69_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}