package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_390 {
    private final Production26_390 production = new Production26_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}