package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_203 {
    private final Production26_203 production = new Production26_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}