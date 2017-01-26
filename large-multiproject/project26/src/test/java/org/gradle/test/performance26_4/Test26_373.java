package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_373 {
    private final Production26_373 production = new Production26_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}