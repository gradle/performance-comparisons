package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_14 {
    private final Production38_14 production = new Production38_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}