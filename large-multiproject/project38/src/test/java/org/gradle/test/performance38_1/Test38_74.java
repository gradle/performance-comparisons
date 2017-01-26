package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_74 {
    private final Production38_74 production = new Production38_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}