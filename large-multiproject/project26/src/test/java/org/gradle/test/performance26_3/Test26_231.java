package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_231 {
    private final Production26_231 production = new Production26_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}