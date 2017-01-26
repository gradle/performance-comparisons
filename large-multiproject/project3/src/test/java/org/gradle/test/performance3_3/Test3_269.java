package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_269 {
    private final Production3_269 production = new Production3_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}