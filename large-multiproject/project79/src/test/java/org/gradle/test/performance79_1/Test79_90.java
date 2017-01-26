package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_90 {
    private final Production79_90 production = new Production79_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}