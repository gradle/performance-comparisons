package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_488 {
    private final Production15_488 production = new Production15_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}