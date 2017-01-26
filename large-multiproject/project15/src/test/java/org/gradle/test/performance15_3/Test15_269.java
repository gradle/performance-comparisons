package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_269 {
    private final Production15_269 production = new Production15_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}