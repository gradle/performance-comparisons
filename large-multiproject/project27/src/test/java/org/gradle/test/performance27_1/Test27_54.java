package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_54 {
    private final Production27_54 production = new Production27_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}