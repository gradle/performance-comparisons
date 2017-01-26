package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_257 {
    private final Production69_257 production = new Production69_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}