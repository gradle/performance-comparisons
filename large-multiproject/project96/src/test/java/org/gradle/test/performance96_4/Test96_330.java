package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_330 {
    private final Production96_330 production = new Production96_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}