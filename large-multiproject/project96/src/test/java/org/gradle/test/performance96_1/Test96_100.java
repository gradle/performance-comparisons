package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_100 {
    private final Production96_100 production = new Production96_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}