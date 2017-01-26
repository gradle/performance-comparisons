package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_388 {
    private final Production96_388 production = new Production96_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}