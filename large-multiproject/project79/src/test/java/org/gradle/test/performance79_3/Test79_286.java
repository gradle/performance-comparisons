package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_286 {
    private final Production79_286 production = new Production79_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}