package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_196 {
    private final Production59_196 production = new Production59_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}