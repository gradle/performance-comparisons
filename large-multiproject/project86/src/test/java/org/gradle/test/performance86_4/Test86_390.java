package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_390 {
    private final Production86_390 production = new Production86_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}