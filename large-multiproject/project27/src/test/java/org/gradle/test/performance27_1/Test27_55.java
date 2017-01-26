package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_55 {
    private final Production27_55 production = new Production27_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}