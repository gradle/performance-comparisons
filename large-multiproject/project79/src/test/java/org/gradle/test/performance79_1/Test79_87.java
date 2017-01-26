package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_87 {
    private final Production79_87 production = new Production79_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}