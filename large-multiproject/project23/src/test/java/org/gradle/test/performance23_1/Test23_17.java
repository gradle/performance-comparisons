package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_17 {
    private final Production23_17 production = new Production23_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}