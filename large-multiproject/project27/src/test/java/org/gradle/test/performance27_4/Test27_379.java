package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_379 {
    private final Production27_379 production = new Production27_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}