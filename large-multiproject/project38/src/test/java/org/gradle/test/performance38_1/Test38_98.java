package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_98 {
    private final Production38_98 production = new Production38_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}