package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_59 {
    private final Production15_59 production = new Production15_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}