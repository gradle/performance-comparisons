package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_269 {
    private final Production8_269 production = new Production8_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}