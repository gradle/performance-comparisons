package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_476 {
    private final Production59_476 production = new Production59_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}