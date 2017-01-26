package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_269 {
    private final Production79_269 production = new Production79_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}