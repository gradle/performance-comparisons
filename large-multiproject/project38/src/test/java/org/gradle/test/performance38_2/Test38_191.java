package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_191 {
    private final Production38_191 production = new Production38_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}