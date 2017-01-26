package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_261 {
    private final Production23_261 production = new Production23_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}