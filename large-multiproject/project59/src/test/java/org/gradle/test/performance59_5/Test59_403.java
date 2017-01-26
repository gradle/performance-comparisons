package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_403 {
    private final Production59_403 production = new Production59_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}