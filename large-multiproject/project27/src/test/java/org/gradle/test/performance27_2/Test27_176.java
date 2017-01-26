package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_176 {
    private final Production27_176 production = new Production27_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}