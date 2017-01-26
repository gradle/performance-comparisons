package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_269 {
    private final Production38_269 production = new Production38_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}