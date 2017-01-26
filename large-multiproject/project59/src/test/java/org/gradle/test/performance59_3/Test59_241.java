package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_241 {
    private final Production59_241 production = new Production59_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}