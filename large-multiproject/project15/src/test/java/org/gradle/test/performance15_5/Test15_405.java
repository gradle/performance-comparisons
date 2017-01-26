package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_405 {
    private final Production15_405 production = new Production15_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}