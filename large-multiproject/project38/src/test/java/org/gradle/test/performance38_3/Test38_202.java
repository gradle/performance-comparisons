package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_202 {
    private final Production38_202 production = new Production38_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}