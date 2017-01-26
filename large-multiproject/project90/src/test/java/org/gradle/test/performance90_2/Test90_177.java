package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_177 {
    private final Production90_177 production = new Production90_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}