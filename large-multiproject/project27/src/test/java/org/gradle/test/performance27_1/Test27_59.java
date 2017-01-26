package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_59 {
    private final Production27_59 production = new Production27_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}