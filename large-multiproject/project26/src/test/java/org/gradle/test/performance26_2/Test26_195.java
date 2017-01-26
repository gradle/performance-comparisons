package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_195 {
    private final Production26_195 production = new Production26_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}