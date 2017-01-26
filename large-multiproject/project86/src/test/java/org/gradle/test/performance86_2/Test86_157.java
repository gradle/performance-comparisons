package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_157 {
    private final Production86_157 production = new Production86_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}