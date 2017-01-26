package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_304 {
    private final Production23_304 production = new Production23_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}