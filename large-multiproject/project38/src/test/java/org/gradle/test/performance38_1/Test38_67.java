package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_67 {
    private final Production38_67 production = new Production38_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}