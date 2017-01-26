package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_325 {
    private final Production26_325 production = new Production26_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}