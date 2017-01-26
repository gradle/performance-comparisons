package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_80 {
    private final Production96_80 production = new Production96_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}