package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_269 {
    private final Production69_269 production = new Production69_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}