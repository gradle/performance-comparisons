package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_63 {
    private final Production30_63 production = new Production30_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}