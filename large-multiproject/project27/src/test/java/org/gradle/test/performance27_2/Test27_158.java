package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_158 {
    private final Production27_158 production = new Production27_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}