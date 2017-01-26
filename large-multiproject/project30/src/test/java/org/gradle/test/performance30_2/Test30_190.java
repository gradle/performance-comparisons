package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_190 {
    private final Production30_190 production = new Production30_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}