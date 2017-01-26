package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_33 {
    private final Production27_33 production = new Production27_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}