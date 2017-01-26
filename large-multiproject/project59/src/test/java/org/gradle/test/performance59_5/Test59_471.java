package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_471 {
    private final Production59_471 production = new Production59_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}