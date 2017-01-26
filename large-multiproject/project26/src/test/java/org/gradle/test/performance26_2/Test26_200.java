package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_200 {
    private final Production26_200 production = new Production26_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}