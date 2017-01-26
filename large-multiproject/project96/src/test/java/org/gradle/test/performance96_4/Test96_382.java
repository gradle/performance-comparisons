package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_382 {
    private final Production96_382 production = new Production96_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}