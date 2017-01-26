package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_422 {
    private final Production38_422 production = new Production38_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}