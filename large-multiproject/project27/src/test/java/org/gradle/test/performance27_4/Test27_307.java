package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_307 {
    private final Production27_307 production = new Production27_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}