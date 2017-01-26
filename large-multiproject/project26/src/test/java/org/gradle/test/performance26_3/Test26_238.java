package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_238 {
    private final Production26_238 production = new Production26_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}