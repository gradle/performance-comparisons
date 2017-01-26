package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_269 {
    private final Production81_269 production = new Production81_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}