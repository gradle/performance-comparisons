package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_41 {
    private final Production86_41 production = new Production86_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}