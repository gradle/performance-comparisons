package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_390 {
    private final Production38_390 production = new Production38_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}