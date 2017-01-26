package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_166 {
    private final Production96_166 production = new Production96_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}