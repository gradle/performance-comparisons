package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_6 {
    private final Production59_6 production = new Production59_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}