package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_199 {
    private final Production30_199 production = new Production30_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}