package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_362 {
    private final Production92_362 production = new Production92_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}