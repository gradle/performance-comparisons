package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_358 {
    private final Production96_358 production = new Production96_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}