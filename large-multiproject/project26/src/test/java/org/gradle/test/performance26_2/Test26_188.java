package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_188 {
    private final Production26_188 production = new Production26_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}