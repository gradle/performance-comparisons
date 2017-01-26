package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_66 {
    private final Production86_66 production = new Production86_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}