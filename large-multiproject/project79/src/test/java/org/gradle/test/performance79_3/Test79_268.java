package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_268 {
    private final Production79_268 production = new Production79_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}