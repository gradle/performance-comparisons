package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_269 {
    private final Production7_269 production = new Production7_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}