package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_445 {
    private final Production96_445 production = new Production96_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}