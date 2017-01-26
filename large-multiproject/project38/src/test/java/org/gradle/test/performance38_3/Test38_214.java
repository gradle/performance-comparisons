package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_214 {
    private final Production38_214 production = new Production38_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}