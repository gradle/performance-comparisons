package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_84 {
    private final Production15_84 production = new Production15_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}