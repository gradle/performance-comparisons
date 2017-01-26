package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_2 {
    private final Production38_2 production = new Production38_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}