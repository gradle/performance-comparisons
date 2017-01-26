package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_49 {
    private final Production96_49 production = new Production96_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}