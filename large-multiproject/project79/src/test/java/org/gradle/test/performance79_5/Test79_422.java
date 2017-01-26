package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_422 {
    private final Production79_422 production = new Production79_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}