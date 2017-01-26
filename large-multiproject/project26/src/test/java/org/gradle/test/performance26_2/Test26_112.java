package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_112 {
    private final Production26_112 production = new Production26_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}