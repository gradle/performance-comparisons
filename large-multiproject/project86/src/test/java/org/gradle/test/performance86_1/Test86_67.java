package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_67 {
    private final Production86_67 production = new Production86_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}