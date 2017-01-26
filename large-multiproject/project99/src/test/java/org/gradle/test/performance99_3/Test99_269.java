package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_269 {
    private final Production99_269 production = new Production99_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}