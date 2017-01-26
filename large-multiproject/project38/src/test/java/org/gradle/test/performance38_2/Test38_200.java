package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_200 {
    private final Production38_200 production = new Production38_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}