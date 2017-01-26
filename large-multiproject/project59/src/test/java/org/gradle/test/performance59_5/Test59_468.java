package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_468 {
    private final Production59_468 production = new Production59_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}