package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_33 {
    private final Production30_33 production = new Production30_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}