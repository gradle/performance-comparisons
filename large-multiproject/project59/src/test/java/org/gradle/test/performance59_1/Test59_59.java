package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_59 {
    private final Production59_59 production = new Production59_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}