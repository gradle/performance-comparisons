package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_455 {
    private final Production59_455 production = new Production59_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}