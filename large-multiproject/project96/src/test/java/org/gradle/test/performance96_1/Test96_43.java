package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_43 {
    private final Production96_43 production = new Production96_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}