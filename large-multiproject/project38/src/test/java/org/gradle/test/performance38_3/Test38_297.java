package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_297 {
    private final Production38_297 production = new Production38_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}