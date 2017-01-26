package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_431 {
    private final Production23_431 production = new Production23_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}