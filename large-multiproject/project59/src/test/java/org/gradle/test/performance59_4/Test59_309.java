package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_309 {
    private final Production59_309 production = new Production59_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}