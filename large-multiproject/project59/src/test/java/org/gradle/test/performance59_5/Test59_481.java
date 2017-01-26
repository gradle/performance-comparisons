package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_481 {
    private final Production59_481 production = new Production59_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}