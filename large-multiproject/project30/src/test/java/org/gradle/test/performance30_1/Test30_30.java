package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_30 {
    private final Production30_30 production = new Production30_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}