package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_269 {
    private final Production45_269 production = new Production45_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}