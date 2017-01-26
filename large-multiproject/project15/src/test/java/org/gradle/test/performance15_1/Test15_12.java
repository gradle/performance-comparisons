package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_12 {
    private final Production15_12 production = new Production15_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}