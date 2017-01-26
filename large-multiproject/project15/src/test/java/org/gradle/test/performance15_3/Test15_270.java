package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_270 {
    private final Production15_270 production = new Production15_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}