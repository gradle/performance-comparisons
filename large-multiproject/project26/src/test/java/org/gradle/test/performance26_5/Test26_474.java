package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_474 {
    private final Production26_474 production = new Production26_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}