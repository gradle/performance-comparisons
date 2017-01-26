package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_160 {
    private final Production90_160 production = new Production90_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}