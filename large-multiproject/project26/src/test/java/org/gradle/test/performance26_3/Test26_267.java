package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_267 {
    private final Production26_267 production = new Production26_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}