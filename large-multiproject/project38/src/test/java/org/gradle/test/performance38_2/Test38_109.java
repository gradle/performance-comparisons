package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_109 {
    private final Production38_109 production = new Production38_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}