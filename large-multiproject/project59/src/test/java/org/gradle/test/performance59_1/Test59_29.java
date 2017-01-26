package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_29 {
    private final Production59_29 production = new Production59_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}