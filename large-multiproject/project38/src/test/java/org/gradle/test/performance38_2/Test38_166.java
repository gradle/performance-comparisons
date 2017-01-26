package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_166 {
    private final Production38_166 production = new Production38_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}