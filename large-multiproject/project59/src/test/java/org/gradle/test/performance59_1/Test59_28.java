package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_28 {
    private final Production59_28 production = new Production59_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}