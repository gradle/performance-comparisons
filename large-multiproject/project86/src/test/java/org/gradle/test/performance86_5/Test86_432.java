package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_432 {
    private final Production86_432 production = new Production86_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}