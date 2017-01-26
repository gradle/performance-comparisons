package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_269 {
    private final Production66_269 production = new Production66_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}