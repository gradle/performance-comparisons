package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_330 {
    private final Production86_330 production = new Production86_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}