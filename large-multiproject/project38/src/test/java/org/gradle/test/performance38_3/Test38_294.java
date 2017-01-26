package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_294 {
    private final Production38_294 production = new Production38_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}