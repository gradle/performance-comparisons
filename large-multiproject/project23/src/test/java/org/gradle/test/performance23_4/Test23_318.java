package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_318 {
    private final Production23_318 production = new Production23_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}