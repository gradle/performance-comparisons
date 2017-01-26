package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_97 {
    private final Production96_97 production = new Production96_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}