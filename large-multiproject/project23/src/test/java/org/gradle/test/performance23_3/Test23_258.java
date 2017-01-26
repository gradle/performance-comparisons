package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_258 {
    private final Production23_258 production = new Production23_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}