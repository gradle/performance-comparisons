package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_74 {
    private final Production86_74 production = new Production86_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}