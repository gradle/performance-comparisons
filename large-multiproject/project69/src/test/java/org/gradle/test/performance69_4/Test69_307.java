package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_307 {
    private final Production69_307 production = new Production69_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}