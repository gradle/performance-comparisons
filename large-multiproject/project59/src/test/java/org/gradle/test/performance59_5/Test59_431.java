package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_431 {
    private final Production59_431 production = new Production59_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}