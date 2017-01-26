package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_238 {
    private final Production59_238 production = new Production59_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}