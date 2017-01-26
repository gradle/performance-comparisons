package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_360 {
    private final Production86_360 production = new Production86_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}