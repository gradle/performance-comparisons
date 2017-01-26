package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_44 {
    private final Production26_44 production = new Production26_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}