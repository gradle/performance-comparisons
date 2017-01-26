package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_281 {
    private final Production86_281 production = new Production86_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}