package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_495 {
    private final Production86_495 production = new Production86_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}