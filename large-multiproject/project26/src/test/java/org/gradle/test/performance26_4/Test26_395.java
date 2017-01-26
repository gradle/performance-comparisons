package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_395 {
    private final Production26_395 production = new Production26_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}