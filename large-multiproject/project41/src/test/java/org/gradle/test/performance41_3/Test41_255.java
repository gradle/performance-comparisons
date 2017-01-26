package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_255 {
    private final Production41_255 production = new Production41_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}