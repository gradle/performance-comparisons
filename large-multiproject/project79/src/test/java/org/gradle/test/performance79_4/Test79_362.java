package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_362 {
    private final Production79_362 production = new Production79_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}