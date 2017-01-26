package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_221 {
    private final Production23_221 production = new Production23_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}