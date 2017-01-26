package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_154 {
    private final Production86_154 production = new Production86_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}