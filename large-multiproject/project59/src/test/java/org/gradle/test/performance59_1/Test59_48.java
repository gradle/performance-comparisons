package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_48 {
    private final Production59_48 production = new Production59_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}