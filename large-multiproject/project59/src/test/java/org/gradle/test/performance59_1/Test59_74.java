package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_74 {
    private final Production59_74 production = new Production59_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}