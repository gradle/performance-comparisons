package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_112 {
    private final Production69_112 production = new Production69_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}