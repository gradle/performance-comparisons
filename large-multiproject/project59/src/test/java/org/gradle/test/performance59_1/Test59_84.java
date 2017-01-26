package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_84 {
    private final Production59_84 production = new Production59_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}