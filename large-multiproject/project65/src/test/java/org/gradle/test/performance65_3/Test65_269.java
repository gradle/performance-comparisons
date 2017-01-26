package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_269 {
    private final Production65_269 production = new Production65_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}