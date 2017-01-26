package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_80 {
    private final Production86_80 production = new Production86_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}