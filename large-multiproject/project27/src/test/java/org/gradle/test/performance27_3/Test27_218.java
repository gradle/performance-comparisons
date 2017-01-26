package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_218 {
    private final Production27_218 production = new Production27_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}