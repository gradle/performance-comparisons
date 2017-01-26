package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_255 {
    private final Production88_255 production = new Production88_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}