package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_192 {
    private final Production90_192 production = new Production90_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}