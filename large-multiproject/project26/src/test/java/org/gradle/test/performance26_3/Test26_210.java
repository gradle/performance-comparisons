package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_210 {
    private final Production26_210 production = new Production26_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}