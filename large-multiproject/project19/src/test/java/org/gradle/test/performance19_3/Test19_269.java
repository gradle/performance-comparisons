package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_269 {
    private final Production19_269 production = new Production19_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}