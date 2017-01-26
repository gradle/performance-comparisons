package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_281 {
    private final Production26_281 production = new Production26_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}