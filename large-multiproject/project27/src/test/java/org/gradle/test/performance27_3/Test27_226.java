package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_226 {
    private final Production27_226 production = new Production27_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}