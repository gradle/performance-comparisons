package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_495 {
    private final Production96_495 production = new Production96_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}