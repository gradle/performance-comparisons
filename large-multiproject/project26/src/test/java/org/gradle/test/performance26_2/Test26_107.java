package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_107 {
    private final Production26_107 production = new Production26_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}