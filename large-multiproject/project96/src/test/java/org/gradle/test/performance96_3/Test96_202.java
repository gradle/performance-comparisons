package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_202 {
    private final Production96_202 production = new Production96_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}