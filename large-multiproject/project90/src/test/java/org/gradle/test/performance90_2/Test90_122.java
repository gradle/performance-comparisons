package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_122 {
    private final Production90_122 production = new Production90_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}