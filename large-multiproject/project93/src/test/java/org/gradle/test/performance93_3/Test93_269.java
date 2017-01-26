package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_269 {
    private final Production93_269 production = new Production93_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}