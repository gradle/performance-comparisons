package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_418 {
    private final Production79_418 production = new Production79_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}