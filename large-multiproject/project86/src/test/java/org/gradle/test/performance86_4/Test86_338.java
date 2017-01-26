package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_338 {
    private final Production86_338 production = new Production86_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}