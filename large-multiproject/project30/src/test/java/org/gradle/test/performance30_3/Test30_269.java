package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_269 {
    private final Production30_269 production = new Production30_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}