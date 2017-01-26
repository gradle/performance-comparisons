package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_10 {
    private final Production79_10 production = new Production79_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}