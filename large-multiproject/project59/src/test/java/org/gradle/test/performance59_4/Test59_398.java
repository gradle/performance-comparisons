package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_398 {
    private final Production59_398 production = new Production59_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}