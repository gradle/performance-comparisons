package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_289 {
    private final Production86_289 production = new Production86_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}