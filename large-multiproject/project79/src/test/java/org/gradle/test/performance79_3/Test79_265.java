package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_265 {
    private final Production79_265 production = new Production79_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}