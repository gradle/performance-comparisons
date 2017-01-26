package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_134 {
    private final Production38_134 production = new Production38_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}