package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_106 {
    private final Production26_106 production = new Production26_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}