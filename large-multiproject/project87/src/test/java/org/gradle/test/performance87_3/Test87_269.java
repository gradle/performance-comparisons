package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_269 {
    private final Production87_269 production = new Production87_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}