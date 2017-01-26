package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_269 {
    private final Production59_269 production = new Production59_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}