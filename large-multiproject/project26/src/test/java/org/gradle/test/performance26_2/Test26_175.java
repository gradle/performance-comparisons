package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_175 {
    private final Production26_175 production = new Production26_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}