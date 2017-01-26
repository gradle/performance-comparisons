package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_14 {
    private final Production69_14 production = new Production69_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}