package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_287 {
    private final Production27_287 production = new Production27_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}