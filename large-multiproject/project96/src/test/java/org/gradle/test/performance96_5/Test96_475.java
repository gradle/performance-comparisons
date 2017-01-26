package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_475 {
    private final Production96_475 production = new Production96_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}