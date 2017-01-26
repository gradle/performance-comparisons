package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_417 {
    private final Production69_417 production = new Production69_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}