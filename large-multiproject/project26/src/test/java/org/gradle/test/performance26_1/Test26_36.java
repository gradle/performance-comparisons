package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_36 {
    private final Production26_36 production = new Production26_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}