package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_3 {
    private final Production26_3 production = new Production26_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}