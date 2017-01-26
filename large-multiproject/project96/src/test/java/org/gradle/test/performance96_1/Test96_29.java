package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_29 {
    private final Production96_29 production = new Production96_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}