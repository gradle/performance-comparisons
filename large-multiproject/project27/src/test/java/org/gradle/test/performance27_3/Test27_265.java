package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_265 {
    private final Production27_265 production = new Production27_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}