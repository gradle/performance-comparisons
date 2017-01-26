package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_320 {
    private final Production79_320 production = new Production79_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}