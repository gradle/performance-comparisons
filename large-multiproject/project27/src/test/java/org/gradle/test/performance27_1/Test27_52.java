package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_52 {
    private final Production27_52 production = new Production27_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}