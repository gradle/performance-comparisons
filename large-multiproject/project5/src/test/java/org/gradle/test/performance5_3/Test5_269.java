package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_269 {
    private final Production5_269 production = new Production5_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}