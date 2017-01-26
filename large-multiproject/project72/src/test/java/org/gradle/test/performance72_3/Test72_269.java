package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_269 {
    private final Production72_269 production = new Production72_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}