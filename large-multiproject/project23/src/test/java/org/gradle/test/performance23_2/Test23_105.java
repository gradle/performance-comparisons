package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_105 {
    private final Production23_105 production = new Production23_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}