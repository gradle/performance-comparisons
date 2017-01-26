package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_269 {
    private final Production39_269 production = new Production39_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}