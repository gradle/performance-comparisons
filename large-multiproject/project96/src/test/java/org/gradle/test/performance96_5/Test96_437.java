package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_437 {
    private final Production96_437 production = new Production96_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}