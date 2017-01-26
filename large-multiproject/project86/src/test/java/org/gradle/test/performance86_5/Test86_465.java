package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_465 {
    private final Production86_465 production = new Production86_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}