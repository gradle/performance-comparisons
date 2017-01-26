package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_466 {
    private final Production26_466 production = new Production26_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}