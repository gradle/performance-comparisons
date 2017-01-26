package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_322 {
    private final Production23_322 production = new Production23_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}