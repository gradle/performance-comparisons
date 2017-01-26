package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_266 {
    private final Production26_266 production = new Production26_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}