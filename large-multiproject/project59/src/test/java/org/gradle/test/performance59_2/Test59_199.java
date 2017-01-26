package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_199 {
    private final Production59_199 production = new Production59_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}