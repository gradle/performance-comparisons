package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_214 {
    private final Production26_214 production = new Production26_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}