package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_62 {
    private final Production26_62 production = new Production26_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}