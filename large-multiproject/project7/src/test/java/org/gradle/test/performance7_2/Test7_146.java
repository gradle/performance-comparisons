package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_146 {
    private final Production7_146 production = new Production7_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}