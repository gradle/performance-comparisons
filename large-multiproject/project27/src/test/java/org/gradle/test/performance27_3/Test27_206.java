package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_206 {
    private final Production27_206 production = new Production27_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}