package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_330 {
    private final Production38_330 production = new Production38_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}