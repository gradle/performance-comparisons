package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_25 {
    private final Production26_25 production = new Production26_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}