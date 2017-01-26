package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_388 {
    private final Production26_388 production = new Production26_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}