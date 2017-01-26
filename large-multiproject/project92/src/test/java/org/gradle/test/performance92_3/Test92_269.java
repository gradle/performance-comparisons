package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_269 {
    private final Production92_269 production = new Production92_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}