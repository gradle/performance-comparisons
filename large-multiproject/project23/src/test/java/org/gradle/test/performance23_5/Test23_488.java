package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_488 {
    private final Production23_488 production = new Production23_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}