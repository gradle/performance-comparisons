package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_195 {
    private final Production86_195 production = new Production86_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}