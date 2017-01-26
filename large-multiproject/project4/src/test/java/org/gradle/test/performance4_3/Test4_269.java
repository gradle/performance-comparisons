package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_269 {
    private final Production4_269 production = new Production4_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}