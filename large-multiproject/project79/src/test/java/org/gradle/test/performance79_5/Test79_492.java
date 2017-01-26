package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_492 {
    private final Production79_492 production = new Production79_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}