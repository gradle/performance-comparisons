package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_329 {
    private final Production59_329 production = new Production59_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}