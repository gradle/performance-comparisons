package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_350 {
    private final Production38_350 production = new Production38_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}