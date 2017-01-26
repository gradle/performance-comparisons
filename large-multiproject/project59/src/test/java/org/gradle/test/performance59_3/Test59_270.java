package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_270 {
    private final Production59_270 production = new Production59_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}