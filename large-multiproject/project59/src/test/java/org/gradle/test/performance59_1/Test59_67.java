package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_67 {
    private final Production59_67 production = new Production59_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}