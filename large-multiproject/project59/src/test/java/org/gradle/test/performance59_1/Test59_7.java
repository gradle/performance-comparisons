package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_7 {
    private final Production59_7 production = new Production59_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}