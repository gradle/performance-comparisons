package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_66 {
    private final Production38_66 production = new Production38_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}