package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_45 {
    private final Production8_45 production = new Production8_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}