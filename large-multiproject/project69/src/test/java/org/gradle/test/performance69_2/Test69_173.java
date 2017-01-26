package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_173 {
    private final Production69_173 production = new Production69_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}