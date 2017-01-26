package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_3 {
    private final Production38_3 production = new Production38_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}