package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_157 {
    private final Production96_157 production = new Production96_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}