package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_381 {
    private final Production90_381 production = new Production90_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}