package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_269 {
    private final Production44_269 production = new Production44_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}