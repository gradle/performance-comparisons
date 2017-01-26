package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_285 {
    private final Production23_285 production = new Production23_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}