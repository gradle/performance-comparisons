package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_146 {
    private final Production60_146 production = new Production60_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}