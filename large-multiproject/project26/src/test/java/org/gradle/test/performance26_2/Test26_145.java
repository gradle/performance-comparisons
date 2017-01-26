package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_145 {
    private final Production26_145 production = new Production26_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}