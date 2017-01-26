package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_268 {
    private final Production96_268 production = new Production96_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}