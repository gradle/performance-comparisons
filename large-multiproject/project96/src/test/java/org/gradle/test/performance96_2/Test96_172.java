package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_172 {
    private final Production96_172 production = new Production96_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}