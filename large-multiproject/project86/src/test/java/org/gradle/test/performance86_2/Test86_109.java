package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_109 {
    private final Production86_109 production = new Production86_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}