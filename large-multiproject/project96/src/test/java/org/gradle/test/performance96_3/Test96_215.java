package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_215 {
    private final Production96_215 production = new Production96_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}