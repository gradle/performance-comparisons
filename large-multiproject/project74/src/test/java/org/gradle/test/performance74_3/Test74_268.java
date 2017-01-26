package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_268 {
    private final Production74_268 production = new Production74_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}