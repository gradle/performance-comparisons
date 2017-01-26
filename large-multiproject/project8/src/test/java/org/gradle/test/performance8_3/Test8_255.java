package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_255 {
    private final Production8_255 production = new Production8_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}