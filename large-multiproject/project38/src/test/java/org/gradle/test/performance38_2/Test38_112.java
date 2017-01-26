package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_112 {
    private final Production38_112 production = new Production38_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}