package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_269 {
    private final Production31_269 production = new Production31_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}