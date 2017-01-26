package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_358 {
    private final Production26_358 production = new Production26_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}