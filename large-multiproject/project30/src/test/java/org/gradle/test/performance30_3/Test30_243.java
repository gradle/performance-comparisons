package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_243 {
    private final Production30_243 production = new Production30_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}