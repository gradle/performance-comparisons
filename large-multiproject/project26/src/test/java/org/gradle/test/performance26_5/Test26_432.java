package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_432 {
    private final Production26_432 production = new Production26_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}