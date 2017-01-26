package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_286 {
    private final Production96_286 production = new Production96_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}