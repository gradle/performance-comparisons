package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_471 {
    private final Production23_471 production = new Production23_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}