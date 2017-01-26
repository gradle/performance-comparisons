package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_469 {
    private final Production23_469 production = new Production23_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}