package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_405 {
    private final Production23_405 production = new Production23_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}