package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_269 {
    private final Production74_269 production = new Production74_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}