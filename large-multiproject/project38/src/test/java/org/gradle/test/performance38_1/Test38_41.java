package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_41 {
    private final Production38_41 production = new Production38_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}