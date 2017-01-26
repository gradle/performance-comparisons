package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_39 {
    private final Production26_39 production = new Production26_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}