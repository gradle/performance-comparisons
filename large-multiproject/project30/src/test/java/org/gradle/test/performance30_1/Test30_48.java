package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_48 {
    private final Production30_48 production = new Production30_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}