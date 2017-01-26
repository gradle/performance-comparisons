package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_329 {
    private final Production69_329 production = new Production69_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}