package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_306 {
    private final Production79_306 production = new Production79_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}