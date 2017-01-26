package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_243 {
    private final Production59_243 production = new Production59_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}