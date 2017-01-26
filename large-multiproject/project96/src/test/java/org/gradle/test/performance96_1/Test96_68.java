package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_68 {
    private final Production96_68 production = new Production96_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}