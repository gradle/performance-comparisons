package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_267 {
    private final Production96_267 production = new Production96_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}