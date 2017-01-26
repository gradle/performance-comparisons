package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_145 {
    private final Production69_145 production = new Production69_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}