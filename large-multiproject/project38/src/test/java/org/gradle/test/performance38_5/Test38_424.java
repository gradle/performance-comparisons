package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_424 {
    private final Production38_424 production = new Production38_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}