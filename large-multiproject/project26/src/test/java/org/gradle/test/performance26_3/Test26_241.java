package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_241 {
    private final Production26_241 production = new Production26_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}