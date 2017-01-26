package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_348 {
    private final Production27_348 production = new Production27_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}