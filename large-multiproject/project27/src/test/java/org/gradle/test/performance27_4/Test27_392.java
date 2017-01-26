package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_392 {
    private final Production27_392 production = new Production27_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}