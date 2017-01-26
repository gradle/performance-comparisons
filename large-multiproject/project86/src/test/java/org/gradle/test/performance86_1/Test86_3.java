package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_3 {
    private final Production86_3 production = new Production86_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}