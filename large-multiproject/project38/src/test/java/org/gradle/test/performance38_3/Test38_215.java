package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_215 {
    private final Production38_215 production = new Production38_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}