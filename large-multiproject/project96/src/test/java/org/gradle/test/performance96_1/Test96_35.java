package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_35 {
    private final Production96_35 production = new Production96_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}