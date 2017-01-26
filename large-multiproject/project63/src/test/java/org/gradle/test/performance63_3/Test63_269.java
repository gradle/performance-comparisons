package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_269 {
    private final Production63_269 production = new Production63_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}