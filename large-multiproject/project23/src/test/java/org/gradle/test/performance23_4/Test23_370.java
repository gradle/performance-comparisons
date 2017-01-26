package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_370 {
    private final Production23_370 production = new Production23_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}