package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_417 {
    private final Production96_417 production = new Production96_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}