package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_60 {
    private final Production79_60 production = new Production79_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}