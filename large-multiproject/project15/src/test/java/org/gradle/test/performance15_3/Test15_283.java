package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_283 {
    private final Production15_283 production = new Production15_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}