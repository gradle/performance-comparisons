package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_57 {
    private final Production69_57 production = new Production69_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}