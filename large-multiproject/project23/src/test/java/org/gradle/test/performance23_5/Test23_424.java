package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_424 {
    private final Production23_424 production = new Production23_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}