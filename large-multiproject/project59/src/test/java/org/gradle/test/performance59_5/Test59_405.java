package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_405 {
    private final Production59_405 production = new Production59_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}