package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_288 {
    private final Production86_288 production = new Production86_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}