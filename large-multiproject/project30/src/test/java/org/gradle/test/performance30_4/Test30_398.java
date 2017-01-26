package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_398 {
    private final Production30_398 production = new Production30_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}