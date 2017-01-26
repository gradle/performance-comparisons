package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_269 {
    private final Production1_269 production = new Production1_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}