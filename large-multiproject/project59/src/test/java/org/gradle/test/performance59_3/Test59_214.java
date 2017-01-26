package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_214 {
    private final Production59_214 production = new Production59_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}