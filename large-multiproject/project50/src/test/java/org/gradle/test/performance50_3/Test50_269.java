package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_269 {
    private final Production50_269 production = new Production50_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}