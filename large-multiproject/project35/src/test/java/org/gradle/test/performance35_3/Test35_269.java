package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_269 {
    private final Production35_269 production = new Production35_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}