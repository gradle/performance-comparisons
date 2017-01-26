package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_209 {
    private final Production96_209 production = new Production96_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}