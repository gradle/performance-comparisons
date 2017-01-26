package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_53 {
    private final Production38_53 production = new Production38_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}