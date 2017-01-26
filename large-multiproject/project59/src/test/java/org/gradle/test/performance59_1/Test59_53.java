package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_53 {
    private final Production59_53 production = new Production59_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}