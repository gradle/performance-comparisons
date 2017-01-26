package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_84 {
    private final Production30_84 production = new Production30_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}