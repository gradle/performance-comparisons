package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_288 {
    private final Production96_288 production = new Production96_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}