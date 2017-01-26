package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_229 {
    private final Production26_229 production = new Production26_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}