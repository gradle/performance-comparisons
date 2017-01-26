package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_131 {
    private final Production23_131 production = new Production23_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}