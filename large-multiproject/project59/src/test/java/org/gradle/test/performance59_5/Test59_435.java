package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_435 {
    private final Production59_435 production = new Production59_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}