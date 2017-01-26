package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_269 {
    private final Production9_269 production = new Production9_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}