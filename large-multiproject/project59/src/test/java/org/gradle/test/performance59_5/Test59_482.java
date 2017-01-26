package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_482 {
    private final Production59_482 production = new Production59_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}