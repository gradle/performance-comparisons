package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_45 {
    private final Production96_45 production = new Production96_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}