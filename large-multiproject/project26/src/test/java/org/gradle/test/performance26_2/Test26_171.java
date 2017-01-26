package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_171 {
    private final Production26_171 production = new Production26_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}