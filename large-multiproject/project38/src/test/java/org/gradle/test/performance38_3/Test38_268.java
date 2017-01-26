package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_268 {
    private final Production38_268 production = new Production38_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}