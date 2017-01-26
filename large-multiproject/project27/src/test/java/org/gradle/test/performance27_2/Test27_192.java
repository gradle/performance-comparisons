package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_192 {
    private final Production27_192 production = new Production27_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}