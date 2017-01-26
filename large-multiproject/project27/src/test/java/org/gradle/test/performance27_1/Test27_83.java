package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_83 {
    private final Production27_83 production = new Production27_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}