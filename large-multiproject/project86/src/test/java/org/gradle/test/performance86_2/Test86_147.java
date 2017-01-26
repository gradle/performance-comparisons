package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_147 {
    private final Production86_147 production = new Production86_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}