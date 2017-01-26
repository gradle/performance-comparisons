package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_29 {
    private final Production86_29 production = new Production86_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}