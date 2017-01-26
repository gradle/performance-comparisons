package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_102 {
    private final Production38_102 production = new Production38_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}