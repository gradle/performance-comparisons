package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_464 {
    private final Production38_464 production = new Production38_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}