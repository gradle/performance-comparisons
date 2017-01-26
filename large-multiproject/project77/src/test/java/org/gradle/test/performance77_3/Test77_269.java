package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_269 {
    private final Production77_269 production = new Production77_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}