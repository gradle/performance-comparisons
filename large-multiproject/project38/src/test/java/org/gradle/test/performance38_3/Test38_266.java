package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_266 {
    private final Production38_266 production = new Production38_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}