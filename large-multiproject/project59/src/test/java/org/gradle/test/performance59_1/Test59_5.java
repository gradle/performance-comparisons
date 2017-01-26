package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_5 {
    private final Production59_5 production = new Production59_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}