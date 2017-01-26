package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_58 {
    private final Production38_58 production = new Production38_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}