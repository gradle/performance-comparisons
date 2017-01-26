package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_305 {
    private final Production26_305 production = new Production26_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}