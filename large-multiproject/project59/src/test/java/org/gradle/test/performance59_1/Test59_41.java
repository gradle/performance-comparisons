package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_41 {
    private final Production59_41 production = new Production59_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}