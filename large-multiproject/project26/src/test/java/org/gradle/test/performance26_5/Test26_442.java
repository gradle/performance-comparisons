package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_442 {
    private final Production26_442 production = new Production26_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}