package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_190 {
    private final Production90_190 production = new Production90_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}