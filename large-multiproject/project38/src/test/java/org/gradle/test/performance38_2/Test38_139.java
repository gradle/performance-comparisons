package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_139 {
    private final Production38_139 production = new Production38_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}