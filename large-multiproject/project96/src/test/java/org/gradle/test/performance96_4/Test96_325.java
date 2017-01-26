package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_325 {
    private final Production96_325 production = new Production96_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}