package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_38 {
    private final Production38_38 production = new Production38_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}