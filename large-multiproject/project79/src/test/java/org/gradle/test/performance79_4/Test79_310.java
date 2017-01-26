package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_310 {
    private final Production79_310 production = new Production79_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}