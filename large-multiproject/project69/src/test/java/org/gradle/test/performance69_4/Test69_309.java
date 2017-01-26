package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_309 {
    private final Production69_309 production = new Production69_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}