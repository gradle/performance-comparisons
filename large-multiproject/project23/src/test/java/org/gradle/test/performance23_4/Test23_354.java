package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_354 {
    private final Production23_354 production = new Production23_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}