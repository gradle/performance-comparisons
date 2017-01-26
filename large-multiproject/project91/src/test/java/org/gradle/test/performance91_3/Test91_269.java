package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_269 {
    private final Production91_269 production = new Production91_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}