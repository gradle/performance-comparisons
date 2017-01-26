package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_336 {
    private final Production38_336 production = new Production38_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}