package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_435 {
    private final Production23_435 production = new Production23_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}