package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_29 {
    private final Production26_29 production = new Production26_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}