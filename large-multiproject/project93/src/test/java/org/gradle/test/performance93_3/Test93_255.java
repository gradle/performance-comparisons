package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_255 {
    private final Production93_255 production = new Production93_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}