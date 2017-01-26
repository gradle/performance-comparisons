package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_84 {
    private final Production26_84 production = new Production26_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}