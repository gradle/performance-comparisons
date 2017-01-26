package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_269 {
    private final Production18_269 production = new Production18_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}