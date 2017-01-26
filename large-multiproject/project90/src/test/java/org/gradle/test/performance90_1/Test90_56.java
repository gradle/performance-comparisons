package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_56 {
    private final Production90_56 production = new Production90_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}