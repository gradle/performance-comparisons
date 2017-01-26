package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_189 {
    private final Production69_189 production = new Production69_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}