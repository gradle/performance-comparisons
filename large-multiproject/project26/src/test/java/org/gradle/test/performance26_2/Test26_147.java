package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_147 {
    private final Production26_147 production = new Production26_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}