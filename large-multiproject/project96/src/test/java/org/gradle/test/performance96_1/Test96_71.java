package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_71 {
    private final Production96_71 production = new Production96_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}