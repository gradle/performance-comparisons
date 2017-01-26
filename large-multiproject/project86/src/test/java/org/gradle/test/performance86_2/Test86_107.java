package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_107 {
    private final Production86_107 production = new Production86_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}