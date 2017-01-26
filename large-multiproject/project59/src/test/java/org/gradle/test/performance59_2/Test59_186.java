package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_186 {
    private final Production59_186 production = new Production59_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}