package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_420 {
    private final Production23_420 production = new Production23_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}