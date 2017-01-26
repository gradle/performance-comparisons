package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_270 {
    private final Production69_270 production = new Production69_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}