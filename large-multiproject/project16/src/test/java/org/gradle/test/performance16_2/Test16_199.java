package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_199 {
    private final Production16_199 production = new Production16_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}