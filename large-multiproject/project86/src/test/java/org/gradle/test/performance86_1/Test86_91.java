package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_91 {
    private final Production86_91 production = new Production86_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}