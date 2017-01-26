package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_321 {
    private final Production27_321 production = new Production27_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}