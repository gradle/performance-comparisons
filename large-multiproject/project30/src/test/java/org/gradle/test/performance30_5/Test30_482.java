package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_482 {
    private final Production30_482 production = new Production30_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}