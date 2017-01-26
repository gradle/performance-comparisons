package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_246 {
    private final Production38_246 production = new Production38_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}