package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_39 {
    private final Production59_39 production = new Production59_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}