package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_9 {
    private final Production96_9 production = new Production96_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}