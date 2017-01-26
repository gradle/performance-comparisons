package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_373 {
    private final Production38_373 production = new Production38_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}