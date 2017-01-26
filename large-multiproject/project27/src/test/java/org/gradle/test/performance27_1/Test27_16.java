package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_16 {
    private final Production27_16 production = new Production27_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}