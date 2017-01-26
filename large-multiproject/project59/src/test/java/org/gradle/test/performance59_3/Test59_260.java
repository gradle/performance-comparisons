package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_260 {
    private final Production59_260 production = new Production59_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}