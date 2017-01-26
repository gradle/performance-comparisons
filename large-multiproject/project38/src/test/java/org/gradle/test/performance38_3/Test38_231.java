package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_231 {
    private final Production38_231 production = new Production38_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}