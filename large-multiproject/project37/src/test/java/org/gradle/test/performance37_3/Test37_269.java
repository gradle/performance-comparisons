package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_269 {
    private final Production37_269 production = new Production37_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}