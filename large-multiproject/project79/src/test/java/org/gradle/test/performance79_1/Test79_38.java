package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_38 {
    private final Production79_38 production = new Production79_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}