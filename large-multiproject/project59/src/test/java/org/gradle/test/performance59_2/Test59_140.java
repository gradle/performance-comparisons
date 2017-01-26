package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_140 {
    private final Production59_140 production = new Production59_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}