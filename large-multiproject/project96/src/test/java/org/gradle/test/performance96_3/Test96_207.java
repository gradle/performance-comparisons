package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_207 {
    private final Production96_207 production = new Production96_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}