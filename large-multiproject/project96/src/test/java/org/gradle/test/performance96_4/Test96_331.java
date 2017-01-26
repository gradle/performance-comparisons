package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_331 {
    private final Production96_331 production = new Production96_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}