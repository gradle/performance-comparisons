package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_204 {
    private final Production27_204 production = new Production27_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}