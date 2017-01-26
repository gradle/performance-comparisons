package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_434 {
    private final Production38_434 production = new Production38_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}