package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_158 {
    private final Production60_158 production = new Production60_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}