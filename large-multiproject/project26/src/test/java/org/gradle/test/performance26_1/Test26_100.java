package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_100 {
    private final Production26_100 production = new Production26_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}