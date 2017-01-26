package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_172 {
    private final Production86_172 production = new Production86_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}