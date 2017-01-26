package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_269 {
    private final Production97_269 production = new Production97_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}