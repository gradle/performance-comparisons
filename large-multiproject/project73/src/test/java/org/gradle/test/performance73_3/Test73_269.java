package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_269 {
    private final Production73_269 production = new Production73_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}