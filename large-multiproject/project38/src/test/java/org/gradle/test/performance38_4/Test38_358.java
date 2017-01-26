package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_358 {
    private final Production38_358 production = new Production38_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}