package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_441 {
    private final Production30_441 production = new Production30_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}