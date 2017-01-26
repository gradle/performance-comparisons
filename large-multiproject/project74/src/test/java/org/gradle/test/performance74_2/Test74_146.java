package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_146 {
    private final Production74_146 production = new Production74_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}