package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_4 {
    private final Production59_4 production = new Production59_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}