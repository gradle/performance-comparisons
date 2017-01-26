package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_407 {
    private final Production23_407 production = new Production23_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}