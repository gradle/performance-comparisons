package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_303 {
    private final Production79_303 production = new Production79_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}