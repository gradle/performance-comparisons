package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_77 {
    private final Production96_77 production = new Production96_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}