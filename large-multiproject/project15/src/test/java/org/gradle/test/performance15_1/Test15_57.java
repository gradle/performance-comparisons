package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_57 {
    private final Production15_57 production = new Production15_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}