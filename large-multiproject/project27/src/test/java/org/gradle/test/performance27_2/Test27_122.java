package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_122 {
    private final Production27_122 production = new Production27_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}