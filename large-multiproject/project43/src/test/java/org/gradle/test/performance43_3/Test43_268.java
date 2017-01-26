package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_268 {
    private final Production43_268 production = new Production43_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}