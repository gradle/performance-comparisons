package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_450 {
    private final Production26_450 production = new Production26_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}