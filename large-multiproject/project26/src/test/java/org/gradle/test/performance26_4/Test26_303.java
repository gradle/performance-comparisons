package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_303 {
    private final Production26_303 production = new Production26_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}