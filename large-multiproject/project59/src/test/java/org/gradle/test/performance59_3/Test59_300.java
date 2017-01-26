package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_300 {
    private final Production59_300 production = new Production59_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}