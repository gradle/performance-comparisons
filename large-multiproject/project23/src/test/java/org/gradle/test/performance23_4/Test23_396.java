package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_396 {
    private final Production23_396 production = new Production23_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}