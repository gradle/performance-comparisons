package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_422 {
    private final Production69_422 production = new Production69_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}