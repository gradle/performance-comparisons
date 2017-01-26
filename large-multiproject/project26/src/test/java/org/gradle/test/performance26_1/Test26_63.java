package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_63 {
    private final Production26_63 production = new Production26_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}