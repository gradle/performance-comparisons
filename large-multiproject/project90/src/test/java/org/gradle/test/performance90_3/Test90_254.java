package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_254 {
    private final Production90_254 production = new Production90_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}