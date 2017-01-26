package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_246 {
    private final Production79_246 production = new Production79_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}