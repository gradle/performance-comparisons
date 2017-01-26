package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_70 {
    private final Production27_70 production = new Production27_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}