package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_14 {
    private final Production79_14 production = new Production79_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}