package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_57 {
    private final Production27_57 production = new Production27_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}