package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_338 {
    private final Production26_338 production = new Production26_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}