package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_191 {
    private final Production86_191 production = new Production86_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}