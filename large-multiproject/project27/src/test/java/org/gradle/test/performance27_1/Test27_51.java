package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_51 {
    private final Production27_51 production = new Production27_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}