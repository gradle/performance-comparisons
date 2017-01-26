package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_488 {
    private final Production59_488 production = new Production59_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}