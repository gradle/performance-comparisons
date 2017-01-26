package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_97 {
    private final Production26_97 production = new Production26_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}