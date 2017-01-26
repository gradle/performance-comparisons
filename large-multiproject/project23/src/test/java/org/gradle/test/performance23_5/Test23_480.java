package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_480 {
    private final Production23_480 production = new Production23_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}