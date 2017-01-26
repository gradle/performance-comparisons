package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_482 {
    private final Production27_482 production = new Production27_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}