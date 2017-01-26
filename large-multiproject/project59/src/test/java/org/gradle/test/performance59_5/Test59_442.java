package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_442 {
    private final Production59_442 production = new Production59_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}