package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_415 {
    private final Production96_415 production = new Production96_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}