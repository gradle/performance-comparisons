package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_293 {
    private final Production26_293 production = new Production26_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}