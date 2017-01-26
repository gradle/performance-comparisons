package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_337 {
    private final Production26_337 production = new Production26_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}