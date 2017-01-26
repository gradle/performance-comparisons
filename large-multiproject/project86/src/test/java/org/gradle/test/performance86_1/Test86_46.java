package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_46 {
    private final Production86_46 production = new Production86_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}