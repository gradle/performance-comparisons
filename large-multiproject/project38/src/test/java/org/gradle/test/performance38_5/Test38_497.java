package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_497 {
    private final Production38_497 production = new Production38_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}