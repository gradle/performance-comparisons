package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_178 {
    private final Production90_178 production = new Production90_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}