package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_442 {
    private final Production38_442 production = new Production38_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}