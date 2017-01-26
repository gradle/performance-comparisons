package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_403 {
    private final Production30_403 production = new Production30_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}