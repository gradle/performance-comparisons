package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_261 {
    private final Production27_261 production = new Production27_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}