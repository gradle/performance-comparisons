package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_392 {
    private final Production79_392 production = new Production79_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}