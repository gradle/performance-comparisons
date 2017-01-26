package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_313 {
    private final Production27_313 production = new Production27_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}