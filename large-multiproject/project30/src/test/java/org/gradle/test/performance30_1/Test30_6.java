package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_6 {
    private final Production30_6 production = new Production30_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}