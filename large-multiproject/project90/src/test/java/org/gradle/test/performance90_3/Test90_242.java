package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_242 {
    private final Production90_242 production = new Production90_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}