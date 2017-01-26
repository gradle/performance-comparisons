package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_269 {
    private final Production10_269 production = new Production10_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}