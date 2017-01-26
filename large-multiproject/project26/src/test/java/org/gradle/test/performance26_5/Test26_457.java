package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_457 {
    private final Production26_457 production = new Production26_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}