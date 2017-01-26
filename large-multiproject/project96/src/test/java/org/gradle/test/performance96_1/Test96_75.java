package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_75 {
    private final Production96_75 production = new Production96_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}