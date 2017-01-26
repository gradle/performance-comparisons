package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_337 {
    private final Production69_337 production = new Production69_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}