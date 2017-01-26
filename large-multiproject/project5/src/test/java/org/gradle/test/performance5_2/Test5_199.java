package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_199 {
    private final Production5_199 production = new Production5_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}