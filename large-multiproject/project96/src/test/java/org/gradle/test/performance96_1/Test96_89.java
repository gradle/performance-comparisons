package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_89 {
    private final Production96_89 production = new Production96_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}