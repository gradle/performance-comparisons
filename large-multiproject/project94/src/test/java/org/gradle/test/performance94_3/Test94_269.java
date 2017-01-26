package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_269 {
    private final Production94_269 production = new Production94_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}