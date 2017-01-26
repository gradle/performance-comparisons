package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_146 {
    private final Production30_146 production = new Production30_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}