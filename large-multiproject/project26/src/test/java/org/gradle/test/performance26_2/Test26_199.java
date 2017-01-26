package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_199 {
    private final Production26_199 production = new Production26_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}