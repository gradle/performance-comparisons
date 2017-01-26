package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_212 {
    private final Production59_212 production = new Production59_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}