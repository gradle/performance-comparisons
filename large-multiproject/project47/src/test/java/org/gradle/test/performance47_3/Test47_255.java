package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_255 {
    private final Production47_255 production = new Production47_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}