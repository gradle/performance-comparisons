package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_142 {
    private final Production27_142 production = new Production27_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}