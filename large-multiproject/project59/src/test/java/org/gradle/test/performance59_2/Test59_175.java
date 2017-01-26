package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_175 {
    private final Production59_175 production = new Production59_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}