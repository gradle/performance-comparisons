package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_358 {
    private final Production79_358 production = new Production79_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}