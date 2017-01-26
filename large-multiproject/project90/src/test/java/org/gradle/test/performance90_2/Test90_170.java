package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_170 {
    private final Production90_170 production = new Production90_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}