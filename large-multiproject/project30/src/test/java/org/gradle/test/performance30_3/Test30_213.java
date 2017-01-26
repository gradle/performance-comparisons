package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_213 {
    private final Production30_213 production = new Production30_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}