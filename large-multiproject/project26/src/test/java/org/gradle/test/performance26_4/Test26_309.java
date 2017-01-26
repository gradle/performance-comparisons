package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_309 {
    private final Production26_309 production = new Production26_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}