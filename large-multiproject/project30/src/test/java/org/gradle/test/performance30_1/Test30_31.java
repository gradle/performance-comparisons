package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_31 {
    private final Production30_31 production = new Production30_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}