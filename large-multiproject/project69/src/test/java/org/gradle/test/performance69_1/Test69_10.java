package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_10 {
    private final Production69_10 production = new Production69_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}