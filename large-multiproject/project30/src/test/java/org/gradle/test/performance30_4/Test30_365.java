package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_365 {
    private final Production30_365 production = new Production30_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}