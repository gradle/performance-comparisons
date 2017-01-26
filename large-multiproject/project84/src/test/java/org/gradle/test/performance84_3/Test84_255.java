package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_255 {
    private final Production84_255 production = new Production84_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}