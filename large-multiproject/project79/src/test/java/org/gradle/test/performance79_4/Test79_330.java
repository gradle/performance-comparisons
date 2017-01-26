package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_330 {
    private final Production79_330 production = new Production79_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}