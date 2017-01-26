package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_25 {
    private final Production59_25 production = new Production59_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}