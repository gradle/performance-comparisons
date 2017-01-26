package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_269 {
    private final Production20_269 production = new Production20_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}