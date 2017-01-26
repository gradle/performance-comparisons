package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_328 {
    private final Production23_328 production = new Production23_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}