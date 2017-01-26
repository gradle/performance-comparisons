package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_46 {
    private final Production26_46 production = new Production26_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}