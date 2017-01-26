package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_186 {
    private final Production79_186 production = new Production79_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}