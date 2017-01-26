package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_217 {
    private final Production59_217 production = new Production59_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}