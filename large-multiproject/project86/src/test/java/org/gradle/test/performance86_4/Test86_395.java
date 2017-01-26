package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_395 {
    private final Production86_395 production = new Production86_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}