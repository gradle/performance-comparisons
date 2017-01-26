package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_147 {
    private final Production38_147 production = new Production38_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}