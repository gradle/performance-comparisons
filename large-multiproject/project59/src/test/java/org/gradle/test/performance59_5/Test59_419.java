package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_419 {
    private final Production59_419 production = new Production59_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}