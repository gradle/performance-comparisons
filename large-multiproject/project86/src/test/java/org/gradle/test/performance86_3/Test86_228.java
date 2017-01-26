package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_228 {
    private final Production86_228 production = new Production86_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}