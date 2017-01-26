package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_36 {
    private final Production30_36 production = new Production30_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}