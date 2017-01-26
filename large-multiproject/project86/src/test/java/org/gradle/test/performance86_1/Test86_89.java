package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_89 {
    private final Production86_89 production = new Production86_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}