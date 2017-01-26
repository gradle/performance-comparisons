package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_97 {
    private final Production86_97 production = new Production86_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}