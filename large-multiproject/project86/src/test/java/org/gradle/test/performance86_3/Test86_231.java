package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_231 {
    private final Production86_231 production = new Production86_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}