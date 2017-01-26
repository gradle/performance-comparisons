package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_305 {
    private final Production79_305 production = new Production79_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}