package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_307 {
    private final Production79_307 production = new Production79_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}