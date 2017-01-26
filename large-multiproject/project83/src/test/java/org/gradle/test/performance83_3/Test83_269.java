package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_269 {
    private final Production83_269 production = new Production83_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}