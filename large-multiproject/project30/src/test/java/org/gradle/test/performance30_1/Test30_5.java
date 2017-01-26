package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_5 {
    private final Production30_5 production = new Production30_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}