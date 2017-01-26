package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_13 {
    private final Production60_13 production = new Production60_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}