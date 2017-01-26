package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_126 {
    private final Production26_126 production = new Production26_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}