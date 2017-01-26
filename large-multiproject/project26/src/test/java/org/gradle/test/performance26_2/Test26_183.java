package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_183 {
    private final Production26_183 production = new Production26_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}