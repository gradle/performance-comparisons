package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_196 {
    private final Production86_196 production = new Production86_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}