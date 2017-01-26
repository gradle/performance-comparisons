package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_253 {
    private final Production59_253 production = new Production59_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}