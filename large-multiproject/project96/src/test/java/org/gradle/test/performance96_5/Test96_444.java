package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_444 {
    private final Production96_444 production = new Production96_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}