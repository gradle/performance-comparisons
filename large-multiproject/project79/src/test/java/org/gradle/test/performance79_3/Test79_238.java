package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_238 {
    private final Production79_238 production = new Production79_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}