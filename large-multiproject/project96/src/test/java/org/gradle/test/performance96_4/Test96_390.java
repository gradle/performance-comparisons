package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_390 {
    private final Production96_390 production = new Production96_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}