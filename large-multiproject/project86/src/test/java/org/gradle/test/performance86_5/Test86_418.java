package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_418 {
    private final Production86_418 production = new Production86_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}