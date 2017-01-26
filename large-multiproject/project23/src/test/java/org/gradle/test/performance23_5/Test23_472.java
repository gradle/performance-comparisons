package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_472 {
    private final Production23_472 production = new Production23_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}