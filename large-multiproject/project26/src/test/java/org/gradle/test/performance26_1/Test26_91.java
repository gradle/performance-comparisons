package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_91 {
    private final Production26_91 production = new Production26_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}