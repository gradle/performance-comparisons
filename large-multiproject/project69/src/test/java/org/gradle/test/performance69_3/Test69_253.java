package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_253 {
    private final Production69_253 production = new Production69_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}