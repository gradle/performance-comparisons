package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_29 {
    private final Production79_29 production = new Production79_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}