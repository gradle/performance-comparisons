package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_377 {
    private final Production59_377 production = new Production59_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}