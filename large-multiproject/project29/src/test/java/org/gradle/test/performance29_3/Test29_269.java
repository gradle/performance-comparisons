package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_269 {
    private final Production29_269 production = new Production29_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}