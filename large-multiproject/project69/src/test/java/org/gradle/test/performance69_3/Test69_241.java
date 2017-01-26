package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_241 {
    private final Production69_241 production = new Production69_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}