package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_143 {
    private final Production90_143 production = new Production90_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}