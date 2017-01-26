package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_465 {
    private final Production26_465 production = new Production26_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}