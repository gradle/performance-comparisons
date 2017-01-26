package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_424 {
    private final Production59_424 production = new Production59_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}