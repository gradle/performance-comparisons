package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_119 {
    private final Production86_119 production = new Production86_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}