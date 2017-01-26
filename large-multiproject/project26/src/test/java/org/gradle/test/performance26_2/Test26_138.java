package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_138 {
    private final Production26_138 production = new Production26_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}