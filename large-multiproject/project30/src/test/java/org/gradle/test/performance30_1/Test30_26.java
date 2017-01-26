package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_26 {
    private final Production30_26 production = new Production30_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}