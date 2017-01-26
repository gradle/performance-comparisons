package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_422 {
    private final Production23_422 production = new Production23_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}