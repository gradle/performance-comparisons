package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_186 {
    private final Production26_186 production = new Production26_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}