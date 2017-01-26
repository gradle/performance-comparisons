package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_139 {
    private final Production59_139 production = new Production59_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}