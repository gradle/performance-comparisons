package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_415 {
    private final Production26_415 production = new Production26_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}