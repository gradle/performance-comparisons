package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_305 {
    private final Production92_305 production = new Production92_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}