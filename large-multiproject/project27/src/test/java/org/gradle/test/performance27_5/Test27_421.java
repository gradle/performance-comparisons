package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_421 {
    private final Production27_421 production = new Production27_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}