package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_145 {
    private final Production38_145 production = new Production38_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}