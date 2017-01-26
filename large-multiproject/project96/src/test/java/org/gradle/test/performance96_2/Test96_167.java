package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_167 {
    private final Production96_167 production = new Production96_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}