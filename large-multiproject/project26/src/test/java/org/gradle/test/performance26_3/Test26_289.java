package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_289 {
    private final Production26_289 production = new Production26_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}