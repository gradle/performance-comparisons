package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_458 {
    private final Production69_458 production = new Production69_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}