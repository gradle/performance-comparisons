package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_382 {
    private final Production79_382 production = new Production79_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}