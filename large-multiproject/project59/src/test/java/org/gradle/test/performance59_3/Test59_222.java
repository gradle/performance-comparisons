package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_222 {
    private final Production59_222 production = new Production59_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}