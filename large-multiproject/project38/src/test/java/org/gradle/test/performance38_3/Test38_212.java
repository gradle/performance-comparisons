package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_212 {
    private final Production38_212 production = new Production38_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}