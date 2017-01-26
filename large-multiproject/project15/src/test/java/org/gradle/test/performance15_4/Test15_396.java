package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_396 {
    private final Production15_396 production = new Production15_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}