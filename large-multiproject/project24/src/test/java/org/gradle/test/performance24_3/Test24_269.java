package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_269 {
    private final Production24_269 production = new Production24_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}