package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_62 {
    private final Production86_62 production = new Production86_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}