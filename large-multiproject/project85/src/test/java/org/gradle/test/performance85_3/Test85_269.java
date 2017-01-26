package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_269 {
    private final Production85_269 production = new Production85_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}