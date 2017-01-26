package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_138 {
    private final Production59_138 production = new Production59_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}