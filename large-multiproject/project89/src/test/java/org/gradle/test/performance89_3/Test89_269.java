package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_269 {
    private final Production89_269 production = new Production89_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}