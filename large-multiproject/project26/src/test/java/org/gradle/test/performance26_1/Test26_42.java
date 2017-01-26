package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_42 {
    private final Production26_42 production = new Production26_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}