package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_220 {
    private final Production59_220 production = new Production59_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}