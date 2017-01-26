package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_30 {
    private final Production27_30 production = new Production27_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}