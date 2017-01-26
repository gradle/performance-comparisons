package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_415 {
    private final Production69_415 production = new Production69_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}