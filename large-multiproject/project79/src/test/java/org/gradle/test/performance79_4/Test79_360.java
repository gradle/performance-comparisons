package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_360 {
    private final Production79_360 production = new Production79_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}