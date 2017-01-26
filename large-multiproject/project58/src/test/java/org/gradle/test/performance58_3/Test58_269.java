package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_269 {
    private final Production58_269 production = new Production58_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}