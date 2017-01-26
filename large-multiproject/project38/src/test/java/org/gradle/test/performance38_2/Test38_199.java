package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_199 {
    private final Production38_199 production = new Production38_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}