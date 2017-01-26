package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_500 {
    private final Production26_500 production = new Production26_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}