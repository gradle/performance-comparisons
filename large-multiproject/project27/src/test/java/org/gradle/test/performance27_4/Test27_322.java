package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_322 {
    private final Production27_322 production = new Production27_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}