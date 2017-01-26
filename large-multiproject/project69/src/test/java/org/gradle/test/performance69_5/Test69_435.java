package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_435 {
    private final Production69_435 production = new Production69_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}