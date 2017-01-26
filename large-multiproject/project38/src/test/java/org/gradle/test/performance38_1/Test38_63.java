package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_63 {
    private final Production38_63 production = new Production38_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}