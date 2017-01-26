package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_363 {
    private final Production27_363 production = new Production27_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}